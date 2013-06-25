package com.mrl.process

import spock.lang.Shared
import spock.lang.Specification

/**
 * User: Michael
 * Date: 6/24/13
 * Time: 9:09 PM
 */
class ProgressionTest extends Specification {
    @Shared AnyObject ao = new AnyObject()

    def "progression is not null"() {
        Progression p = new Progression()
        expect:
        p != null
    }

    def "AnyObject has a progression"() {

        expect:
        ao != null
        ao.progression != null
    }

    def "progression always has a state"() {

        expect:
        ao.progression.state != null
        ao.progression.state == ProgressState.unset
    }

}
