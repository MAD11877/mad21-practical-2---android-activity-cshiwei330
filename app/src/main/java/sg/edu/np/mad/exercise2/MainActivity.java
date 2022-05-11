package sg.edu.np.mad.exercise2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user1 = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "on Create!");
        setContentView(R.layout.activity_main);

        user1.setFollowed(true);
        user1.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        TextView desc = findViewById(R.id.desc);
        Button follow_but = findViewById(R.id.follow);
        desc.setText(user1.getDescription());

        follow_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Button Pressed");
                if (user1.getFollowed()) {
                    user1.setFollowed(false);
                    follow_but.setText("unfollow");
                } else {
                    user1.setFollowed(true);
                    follow_but.setText("follow");
                }
            }
        });
    }
}
