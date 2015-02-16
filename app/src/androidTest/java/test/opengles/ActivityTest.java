package test.opengles;

import android.test.ActivityInstrumentationTestCase2;

public class ActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity activity;

    public ActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testClick() throws Throwable {
        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.findViewById(R.id.button).performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
    }
}
