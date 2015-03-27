package module.assignment_2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


/**
 * created by amar.d on 3/26/2015
 */
public class MainActivity extends ActionBarActivity {

    static final String mGivenString = "asnmnshtadfgmnstksjdkjhasdjkaasdsadgadfgmnstsdjadaklsjdlka";
    static final String mGivenPattern = "adfgmnst";
    private static final String TAG = "###MainActivity###";

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Question:
         * find out the occurrences of mGivenPattern from mGivenString
         *
         * Logic:
         * Split the mGivenString from a mGivenPattern
         * get the length of split string array
         * get pattern occurrence string length from mGivenString by replacing the length of split string array which will be
         * perfectly divisible by mGivenPattern string length,
         * At last divide occurrence string length by mGivenPattern string length, the resultant quotient will be the ans.
         *
         */
        int splitStrLength = 0;
        String[] str = mGivenString.split(mGivenPattern);

        for (String splitStr : str)
            splitStrLength = splitStrLength + splitStr.length();
        Log.v(TAG, "Split Length: " + splitStrLength);

        final int occurrence = ((mGivenString.length() - splitStrLength) / mGivenPattern.length());
        Log.v(TAG, "Occurrences: " + occurrence);
    }
}
