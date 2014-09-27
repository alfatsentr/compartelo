package com.alfats.compartelo.ui.login;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class LoginViewImpl extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(buildUI());
	}
	
	private LinearLayout buildUI(){
		LinearLayout vLayout = new LinearLayout(this);
		vLayout.setBackgroundColor(Color.DKGRAY);
		vLayout.setOrientation(LinearLayout.VERTICAL);
		vLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		
		GridLayout loginGridLayout = new GridLayout(this);
		loginGridLayout.setColumnCount(2);
		loginGridLayout.setBackgroundColor(Color.CYAN);
		LayoutParams gridParams = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		gridParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
		loginGridLayout.setLayoutParams(gridParams);
		vLayout.addView(loginGridLayout);
		
		TextView txtUser = new TextView(this);
		txtUser.setText("Usuario");
		loginGridLayout.addView(txtUser);
		
		final EditText etxtUser = new EditText(this);
		etxtUser.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
		etxtUser.setHint("ejemplo@mail.com");
		etxtUser.setWidth(250);
		loginGridLayout.addView(etxtUser);
		
		TextView txtPass = new TextView(this);
		txtPass.setText("Password");
		loginGridLayout.addView(txtPass);
		
		EditText etxtPass = new EditText(this);
		etxtPass.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
		etxtPass.setWidth(250);
//		etxtPass.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		loginGridLayout.addView(etxtPass);
		
		Button btnLogin = new Button(this);
		btnLogin.setText("Ingresar");
		LayoutParams btnParams = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		btnParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
		btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println(etxtUser.getText().toString());
			}
		});
		btnLogin.setLayoutParams(btnParams);
		
		vLayout.addView(btnLogin);
		return vLayout;
	}
}
