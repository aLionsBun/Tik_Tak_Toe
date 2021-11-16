package com.example.lab2_third_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner [] fields = new Spinner[16];
    TextView winner;
    short winner_flag = 0; //0 for no winner, 1 for X, 2 for O

    /*
        Which combos bring victory (based on spinner number):
        A. 1, 2, 3, 4 (-)
        B. 1, 5, 9, 13 (|)
        C. 1, 6, 11, 16 (\)
        D. 5, 6, 7, 8 (-)
        E. 9, 10, 11, 12 (-)
        F. 13, 14, 15, 16 (-)
        G. 2, 6, 10, 14 (|)
        H. 3, 7, 11, 15 (|)
        I. 4, 8, 12, 16 (|)
        J. 4, 7, 10, 13 (/)

        Combos for each spinner:
        1. A, B, C
        2. A, G
        3. A, H
        4. A, I, J
        5. B, D
        6. C, D, G
        7. D, H, J
        8. D, I
        9. B, E
        10. E, G, J
        11. C, E, H
        12. E, I
        13. B, F, J
        14. F, G
        15. F, H
        16. C, F, I
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fields[0] = (Spinner) findViewById(R.id.spin1);
        fields[1] = (Spinner) findViewById(R.id.spin2);
        fields[2] = (Spinner) findViewById(R.id.spin3);
        fields[3] = (Spinner) findViewById(R.id.spin4);
        fields[4] = (Spinner) findViewById(R.id.spin5);
        fields[5] = (Spinner) findViewById(R.id.spin6);
        fields[6] = (Spinner) findViewById(R.id.spin7);
        fields[7] = (Spinner) findViewById(R.id.spin8);
        fields[8] = (Spinner) findViewById(R.id.spin9);
        fields[9] = (Spinner) findViewById(R.id.spin10);
        fields[10] = (Spinner) findViewById(R.id.spin11);
        fields[11] = (Spinner) findViewById(R.id.spin12);
        fields[12] = (Spinner) findViewById(R.id.spin13);
        fields[13] = (Spinner) findViewById(R.id.spin14);
        fields[14] = (Spinner) findViewById(R.id.spin15);
        fields[15] = (Spinner) findViewById(R.id.spin16);
        winner = (TextView) findViewById(R.id.winner);

            //Checking whether there are any combos when spin1 selection changed
        fields[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo A (either for X or O)
                if(fields[1].getSelectedItem().toString().equals(selection_value) &&
                fields[2].getSelectedItem().toString().equals(selection_value) &&
                fields[3].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo B (either for X or O)
                else if(fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[8].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo C (either for X or O)
                else if(fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin2 selection changed
        fields[1].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo A (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[2].getSelectedItem().toString().equals(selection_value) &&
                        fields[3].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo G (either for X or O)
                else if(fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[13].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin3 selection changed
        fields[2].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo A (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[1].getSelectedItem().toString().equals(selection_value) &&
                        fields[3].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo H (either for X or O)
                else if(fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[14].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin4 selection changed
        fields[3].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                //Checking if there is combo A (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[1].getSelectedItem().toString().equals(selection_value) &&
                        fields[2].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                //Checking if there is combo I (either for X or O)
                else if(fields[7].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo J (either for X or O)
                else if(fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin5 selection changed
        fields[4].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo B (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[8].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo D (either for X or O)
                else if(fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[7].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin6 selection changed
        fields[5].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo C (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo D (either for X or O)
                else if(fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[7].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo G (either for X or O)
                else if(fields[1].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[13].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin7 selection changed
        fields[6].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo D (either for X or O)
                if(fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[7].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo H (either for X or O)
                else if(fields[2].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo J (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin8 selection changed
        fields[7].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo D (either for X or O)
                if(fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo I (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin9 selection changed
        fields[8].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo B (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo E (either for X or O)
                else if(fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin10 selection changed
        fields[9].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo E (either for X or O)
                if(fields[8].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo G (either for X or O)
                else if(fields[1].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[13].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo J (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[12].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

        //Checking whether there are any combos when spin11 selection changed
        fields[10].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo C (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo E (either for X or O)
                else if(fields[8].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo H (either for X or O)
                else if(fields[2].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[14].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

        //Checking whether there are any combos when spin12 selection changed
        fields[11].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo E (either for X or O)
                if(fields[8].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo I (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[7].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin13 selection changed
        fields[12].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo B (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[4].getSelectedItem().toString().equals(selection_value) &&
                        fields[8].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo F (either for X or O)
                else if(fields[13].getSelectedItem().toString().equals(selection_value) &&
                        fields[14].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo J (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin14 selection changed
        fields[13].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo F (either for X or O)
                if(fields[12].getSelectedItem().toString().equals(selection_value) &&
                        fields[14].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo G (either for X or O)
                else if(fields[1].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[9].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin15 selection changed
        fields[14].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo F (either for X or O)
                if(fields[12].getSelectedItem().toString().equals(selection_value) &&
                        fields[13].getSelectedItem().toString().equals(selection_value) &&
                        fields[15].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo H (either for X or O)
                else if(fields[2].getSelectedItem().toString().equals(selection_value) &&
                        fields[6].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });

            //Checking whether there are any combos when spin16 selection changed
        fields[15].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Getting selected value: *, X or O
                String selection_value = adapterView.getItemAtPosition(i).toString();
                    //Checking if there is combo C (either for X or O)
                if(fields[0].getSelectedItem().toString().equals(selection_value) &&
                        fields[5].getSelectedItem().toString().equals(selection_value) &&
                        fields[10].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo F (either for X or O)
                else if(fields[12].getSelectedItem().toString().equals(selection_value) &&
                        fields[13].getSelectedItem().toString().equals(selection_value) &&
                        fields[14].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                    //Checking if there is combo I (either for X or O)
                else if(fields[3].getSelectedItem().toString().equals(selection_value) &&
                        fields[7].getSelectedItem().toString().equals(selection_value) &&
                        fields[11].getSelectedItem().toString().equals(selection_value)) {
                    if(selection_value.equals("X"))
                        winner_flag=1;
                    else if(selection_value.equals("O"))
                        winner_flag=2;
                }
                else
                    winner_flag=0;
                setWinnerText();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                setWinnerText();
            }
        });
    }

        //Changes text in case either X or O wins and ends game in both cases
    public void setWinnerText() {
        switch (winner_flag) {
            case 1:
                winner.setText(R.string.X_wins);
                switchGameMode(false);
                break;
            case 2:
                winner.setText(R.string.O_wins);
                switchGameMode(false);
                break;
            default:
                winner.setText(R.string.no_winner);
                break;
        }
    }

        /*
            Starts up the gaming field when enable_gaming=true
            Turns gaming field off when enable_gaming=false
         */
    public void switchGameMode(boolean enable_gaming)
    {
        for(int i=0; i<16; i++) {
            fields[i].setEnabled(enable_gaming);
            fields[i].setClickable(enable_gaming);
        }
    }

        //Restarts the game
    public void reset(View view) {
        for(int i=0; i<16; i++)
            fields[i].setSelection(0);
        winner.setText(R.string.no_winner);
        winner_flag=0;
        switchGameMode(true);
    }
}