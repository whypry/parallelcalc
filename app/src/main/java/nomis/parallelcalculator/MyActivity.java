    package nomis.parallelcalculator;

    import android.app.Activity;
    import android.os.*;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //--- find all the buttons---
        Button zeroButton = (Button) findViewById(R.id.button17);
        Button oneButton = (Button) findViewById(R.id.button13);
        Button twoButton = (Button) findViewById(R.id.button14);
        Button threeButton = (Button) findViewById(R.id.button15);
        Button fourButton = (Button) findViewById(R.id.button9);
        Button fiveButton = (Button) findViewById(R.id.button10);
        Button sixButton = (Button) findViewById(R.id.button11);
        Button sevenButton = (Button) findViewById(R.id.button5);
        Button eightButton = (Button) findViewById(R.id.button6);
        Button nineButton = (Button) findViewById(R.id.button7);
        Button decimalButton = (Button) findViewById(R.id.button18);
        Button clearButton = (Button) findViewById(R.id.button1);
        Button divideButton = (Button) findViewById(R.id.button2);
        Button multiplyButton = (Button) findViewById(R.id.button3);
        Button subtractButton = (Button) findViewById(R.id.button8);
        Button addButton = (Button) findViewById(R.id.button12);
        Button backspaceButton = (Button) findViewById(R.id.button4);
        Button calculateButton = (Button) findViewById(R.id.button20);

        class CalculateRunnable implements Runnable {
            @Override
            public void run() {
                // Moves the current Thread into the background
                android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);

                /*

                Store the current Thread so the instance can interrupt the Thread
                obj.method(Thread.currentThread());

                 */
            }
        }

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtView = (TextView) findViewById(R.id.editText1)
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
}
