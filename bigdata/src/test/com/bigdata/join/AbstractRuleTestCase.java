/**

Copyright (C) SYSTAP, LLC 2006-2007.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/*
 * Created on Apr 18, 2007
 */

package com.bigdata.join;

import junit.framework.TestCase2;

import com.bigdata.journal.ProxyTestCase;
import com.bigdata.service.EmbeddedFederation;
import com.bigdata.service.IBigdataClient;
import com.bigdata.service.LocalDataServiceFederation;

/**
 * 
 * @todo make this a {@link ProxyTestCase} and run against a
 *       {@link LocalDataServiceFederation}, an {@link EmbeddedFederation},
 *       and a jini federation (the abstraction is the {@link IBigdataClient}).
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
abstract public class AbstractRuleTestCase extends TestCase2 {
    
    /**
     * 
     */
    public AbstractRuleTestCase() {
    }

    /**
     * @param name
     */
    public AbstractRuleTestCase(String name) {
        super(name);
    }

//    /**
//     * Applies the rule, copies the new entailments into the store and checks
//     * the expected #of inferences computed and new statements copied into the
//     * store.
//     * <p>
//     * Invoke as <code>applyRule( store.{rule}, ..., ... )</code>
//     * 
//     * @param rule
//     *            The rule, which must be one of those found on {@link #store}
//     *            or otherwise configured so as to run with the {@link #store}
//     *            instance.
//     * 
//     * @param expectedComputed
//     *            The #of entailments that should be computed by the rule.
//     */
//    protected RuleStats applyRule(IAccessPathFactory db, Rule rule, int expectedComputed) {
//
//        return applyRule(db, rule, null/*filter*/, false/*justified*/, expectedComputed);
//        
//    }
//    
//    /**
//     * Applies the rule, copies the new entailments into the store and checks
//     * the expected #of inferences computed and new statements copied into the
//     * store.
//     * <p>
//     * Invoke as <code>applyRule( store.{rule}, ..., ... )</code>
//     * 
//     * @param rule
//     *            The rule, which must be one of those found on {@link #store}
//     *            or otherwise configured so as to run with the {@link #store}
//     *            instance.
//     * 
//     * @param expectedComputed
//     *            The #of entailments that should be computed by the rule.
//     */
//    protected RuleStats applyRule(IAccessPathFactory db, Rule rule,
//            ISPOFilter filter, boolean justified, int expectedComputed) {
//        
//        /*
//         * Note: Choose a capacity large enough that all entailments will still
//         * be in the buffer until we explicitly flush them to the store. This
//         * let's us dump the entailments to the console below.
//         */
//        
//        final int capacity = Math.max(expectedComputed, 1000);
//        
//        SPOAssertionBuffer buffer = new SPOAssertionBuffer(db, db, filter,
//                capacity, justified);
//        
//        // dump the database on the console.
//        System.err.println("database::" + db.dumpStore());
//        
//        State state = rule.newState(justified, db, buffer);
//        
//        // apply the rule.
//        rule.apply(state);
//        
//        // dump entailments on the console.
//        System.err.println("entailments:: (may duplicate statements in the database)");
//        buffer.dump(db/*used to resolve term identifiers*/);
//
//        // flush entailments to the database.
////        final int nwritten = 
//            buffer.flush();
//        
//        System.err.println("after write on the database: " + db.dumpStore());
//
//        /*
//         * Verify the #of entailments computed. 
//         */
//        if(expectedComputed!=-1) {
//    
//            assertEquals("numComputed",expectedComputed,state.stats.numComputed);
//            
//        }
//        
//        return state.stats;
//        
//    }

}
