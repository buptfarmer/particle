package com.wordpress.buptfarmer.particle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.wordpress.buptfarmer.particle.factory.ExplodeParticleFactory;
import com.wordpress.buptfarmer.particle.factory.FallingParticleFactory;
import com.wordpress.buptfarmer.particle.factory.FlyawayFactory;
import com.wordpress.buptfarmer.particle.factory.VerticalAscentFactory;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExplosionField explosionField = new ExplosionField(this, new FallingParticleFactory());
        explosionField.addListener(findViewById(R.id.text));
        explosionField.addListener(findViewById(R.id.layout1));

        ExplosionField explosionField2 = new ExplosionField(this, new FlyawayFactory());
        explosionField2.addListener(findViewById(R.id.text2));
        explosionField2.addListener(findViewById(R.id.layout2));

        ExplosionField explosionField4 = new ExplosionField(this, new ExplodeParticleFactory());
        explosionField4.addListener(findViewById(R.id.text3));
        explosionField4.addListener(findViewById(R.id.layout3));

        ExplosionField explosionField5 = new ExplosionField(this, new VerticalAscentFactory());
//        explosionField5.addListener(findViewById(R.id.text4));
//        explosionField5.addListener(findViewById(R.id.layout4));
        findViewById(R.id.text4).setOnClickListener(new ParticleListener(explosionField5) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Log.d("cccc", "onclick#text4");
                Toast.makeText(MainActivity.this, "text4 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.layout4).setOnClickListener(new ParticleListener(explosionField5) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Log.d("cccc", "onclick#layout4");
                Toast.makeText(MainActivity.this, "layout4 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
