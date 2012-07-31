package github.com.jan.julia.uniproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.support.v4.app.NavUtils;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void Button1_Click(View v)
    {
    	switch (v.getId()) 
    	{
    	    case R.id.Button1:
    	        Intent i = new Intent(this, Auth.class);
    	        startActivity(i);
    	        break;
        }
    }

    
}
