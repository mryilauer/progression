package com.mrl.process

/**
 * User: Michael
 * Date: 6/24/13
 * Time: 9:07 PM
 */

interface ProgressStatus {Object[] args
    def setState(state)
    def getState()
    def nextState()
    def abort()
    boolean isDone()
}

abstract class Progression implements ProgressStatus{
    enum globalStates {unset, done, aborted}
    def states
    def state
    Progression(states){
        this.states = states
        state = states.init()
    }
    def setState(state){
        this.state = state
        return state
    }

    @Override
    abstract nextState()

    @Override
    abstract abort()

    @Override
    abstract boolean isDone()
}
class BaseProgression extends Progression {
    enum states {start, stage1, stage2}
    BaseProgression(){
        super(states)
    }

    @Override
    def nextState() {
//        if (state >= states.start && state < states.stage2)
//            state =
        return null
    }

    @Override
    def abort() {
        return null
    }

    @Override
    boolean isDone() {
        return false
    }



}
class AnyObject {
    def object
    def Progression progression

    AnyObject(){
        progression = new Progression()
    }
}
