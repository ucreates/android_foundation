// ======================================================================
// Project Name    : android_foundation
//
// Copyright © 2018 U-CREATES. All rights reserved.
//
// This source code is the property of U-CREATES.
// If such findings are accepted at any time.
// We hope the tips and helpful in developing.
// ======================================================================
package com.frontend.component.vfx
open class TimeLine {
    public var currentFrame: Float = 0.0f
        get
        set
    public var currentTime: Float = 0.0f
        get
        set
    public var rate: Float = 1.0f
        get
        set
    open fun next(delta: Float) {
        this.next(delta, 1.0f)
        return
    }
    open fun next(delta: Float, multipleRate: Float) {
        this.currentFrame += this.rate
        this.currentTime += delta * multipleRate
        return
    }
    open fun restore() {
        this.currentFrame = 0.0f
        this.currentTime = 0.0f
        return
    }
}