package com.wordpress.buptfarmer.particle;

import android.view.View;

/**
 * Created by chencheng on 15/12/4.
 */
abstract public class ParticleListener implements View.OnClickListener {
    private ExplosionField mExplosionField;

    public ParticleListener(ExplosionField explosionField) {
        mExplosionField = explosionField;
    }

    @Override
    public void onClick(View v) {
        mExplosionField.explode(v);
    }
}
