package me.sdrew.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    public void launchSpotifyStreamer(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.streamer_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchSuperDuoScores(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.duo_scores_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchSuperDuoLibrary(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.duo_library_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchBuildItBigger(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.build_bigger_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchXYZReader(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.reader_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchCapstone(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.capstone_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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
