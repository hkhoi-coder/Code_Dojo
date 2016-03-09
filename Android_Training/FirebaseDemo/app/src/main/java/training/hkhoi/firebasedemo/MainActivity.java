package training.hkhoi.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Firebase mFirebaseRef;
    private EditText mEditText;
    private Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set up firebase */
        initComponents();
        setUpFireBase();
    }

    private void initComponents() {
        mEditText = (EditText) findViewById(R.id.text_edit);
        mSendButton = (Button) findViewById(R.id.send_button);

    }

    private void setUpFireBase() {
        Firebase.setAndroidContext(this);
        mFirebaseRef = new Firebase("https://intense-heat-9151.firebaseio.com");
    }

    public void onClick(View view) {
        String text = mEditText.getText().toString();
        Map<String, Object> values = new HashMap<>();
        values.put("name", "Android User");
        values.put("text", text);
        mFirebaseRef.push().setValue(values);
        mEditText.setText("");
    }
}
