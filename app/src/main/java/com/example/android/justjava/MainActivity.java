/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffiees =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = numberOfCoffiees*10;
        String compliment ="thank you!";
        String priceMessage = "total: " +price +"\n"+compliment;
        displayMessage(priceMessage);


     }

    public void increased(View view) {

        numberOfCoffiees= numberOfCoffiees +1;
        displayQuantity(numberOfCoffiees);
    }
    public void decreased(View view) {

        numberOfCoffiees = numberOfCoffiees-1;
        displayQuantity(numberOfCoffiees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message){
        TextView priceTextView =(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);

    }

}
