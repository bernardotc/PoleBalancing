/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbgLecture5lab_wrapperForJBox2D;

import org.jbox2d.callbacks.ContactImpulse;
import org.jbox2d.callbacks.ContactListener;
import org.jbox2d.collision.Manifold;
import org.jbox2d.dynamics.Fixture;
import org.jbox2d.dynamics.contacts.Contact;

/**
 *
 * @author bernardot
 */
public class CollisionDetection implements ContactListener {

    @Override
    public void beginContact(Contact contact) {
        System.out.println("Collision");
        String aux = (String) contact.m_fixtureA.m_body.getUserData();
        String aux2 = (String) contact.m_fixtureB.m_body.getUserData();
        if (aux != null && aux.equals("pole") || aux2 != null && aux2.equals("pole")) {
            System.exit(1);
        } else if ((aux != null && aux.equals("rectangle") && aux2 != null && !aux2.equals("bottom")) || (aux != null && !aux.equals("bottom") && aux2 != null && aux2.equals("rectangle"))) {
            System.exit(2);
        }
    }

    @Override
    public void endContact(Contact contact) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
