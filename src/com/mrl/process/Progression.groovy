package com.mrl.process

/**
 * User: Michael
 * Date: 6/24/13
 * Time: 9:07 PM
 */

interface ProgressStatus {Object[] args
    ProgressStatus setState(ProgressState state)
    ProgressState getState()
    ProgressState nextState()
}
enum ProgressState {
    unset, start, step1, aborted, done
}
class Progression {
    def state
    Progression(){
        state = ProgressState.unset
    }
}

class AnyObject {
    def object
    def Progression progression

    AnyObject(){
        progression = new Progression()
    }
}
