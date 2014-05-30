package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class HelloWorldActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_hello_world);
        initDisplayButton();
        initClearDisplayButton();
 /*     if (savedInstanceState == null) {
           getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())                    .commit();
       }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_hello_world, container, false);
            return rootView;
        }
    }
    
    private void initDisplayButton()
    {
    Button displayButton =(Button) findViewById(R.id.buttonDisplay);
    displayButton.setOnClickListener(new OnClickListener () {
    	
    	@Override
    	public void onClick(View arg0){
    		EditText editName= (EditText) findViewById(R.id.editTextName);
    		EditText lastName=(EditText) findViewById(R.id.editlastName);
    		TextView textDisplay =(TextView) findViewById(R.id.textViewDisplay);
    		String nameToDisplay = editName.getText().toString();
    		String lastToDisplay=lastName.getText().toString();
    		
    		textDisplay.setText("Hello " + nameToDisplay + " " + lastToDisplay);
    	}
    });
    
    }
    private void initClearDisplayButton()
    {
    Button clearButton =(Button) findViewById(R.id.clearDisplay);
    clearButton.setOnClickListener(new OnClickListener () {
    	
    	@Override
    	public void onClick(View arg0){
    		EditText editName= (EditText) findViewById(R.id.editTextName);
    		EditText lastName=(EditText) findViewById(R.id.editTextName);
    		TextView textDisplay =(TextView) findViewById(R.id.textViewDisplay);
    		textDisplay.setText("Hello World!");
    		editName.setText(" ");
    		lastName.setText(" ");
    		
    	}
    });
    
    }
    
    

}
