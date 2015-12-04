package com.wordpress.buptfarmer.particle.factory;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;

import com.wordpress.buptfarmer.particle.particle.Particle;

/**
 * Created by Administrator on 2015/11/29 0029.
 */
public abstract class ParticleFactory {
    public abstract Particle[][] generateParticles(Bitmap bitmap, Rect bound);
}
