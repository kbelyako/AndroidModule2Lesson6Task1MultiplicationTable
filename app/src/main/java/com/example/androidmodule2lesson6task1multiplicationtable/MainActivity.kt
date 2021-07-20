package com.example.androidmodule2lesson6task1multiplicationtable
/*
ДЗ. Задание 1. Легкое
Написать приложение для запоминания таблицы умножения. Сверху – кнопки для вызова
таблиц для 1,2,3,4,5,6,7,8,9,10. Внизу – собственно таблица для этого числа.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.multiplication_frgament3.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament1.newInstance(generateTable(1)))
                .commit()

        }

        bt_2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament2.newInstance(generateTable(2)))
                .commit()
        }

        bt_3.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament3.newInstance(generateTable(3)))
                .commit()
            //tvTable.text=generateTable(3)

        }
        bt_4.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament4.newInstance(generateTable(4)))
                .commit()
        }

        bt_5.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament5.newInstance(generateTable(5)))
                .commit()
        }
        bt_6.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament6.newInstance(generateTable(6)))
                .commit()
        }
        bt_7.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament7.newInstance(generateTable(7)))
                .commit()
        }
        bt_8.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament8.newInstance(generateTable(8)))
                .commit()
        }
        bt_9.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable, MultiplicationFrgament9.newInstance(generateTable(9)))
                .commit()
        }

    }

    fun generateTable(num:Int):String{
        var result=""
        var temp=""
        for (i in 1..10){
            if (i==1) temp=num.toString()+"*"+i.toString()+"="+num*i
            else temp='\n'+num.toString()+"*"+i.toString()+"="+num*i
            result=result+temp
        }

        return  result
    }
}