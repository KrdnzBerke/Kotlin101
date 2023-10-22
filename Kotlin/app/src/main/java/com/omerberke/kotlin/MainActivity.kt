package com.omerberke.kotlin

import android.app.AutomaticZenRule
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // Değişkenler (variable)
        var x=5
        var y=4
        println(x*y)

        var age=35
        println(age/7*5)
        age =36
        println(age)

        // Sabitler (constanst)
        val a=5

        // Defining
        var myInteger : Int

        //Initialize
        myInteger=10

        myInteger=20

        val b: Int=23
        println(b/2)

        //Double & Float
        val pi=3.14
        println(pi*2)

        // Stringler
        val name="Omar"
        val surname="Karadeniz"

        val fullname=name+" "+surname

        println(fullname)

        // Boolean
        var myBoolean : Boolean =true
        myBoolean=false

        println(6<3)

        // Conversion (BİRİM DEĞİŞTİRME)

        var input="20"
        var inputInteger=input.toInt()
        println(inputInteger*2)

        // Collections - ARRAY

        val myArray= arrayOf("a","b","c","d")

        //index
        println(myArray[0])
        myArray.set(1,"nelan") //set fonksiyonu kaçıncı indeksi ne yapayım diye sordu
        println(myArray[1])

        myArray[1]="sanane"
        println(myArray[1])  //diğer bir şekilde böyle

        // List - ArrayList
        val myMuzik= arrayListOf<String>("ali","memet")
        myMuzik.add("yara")
        println(myMuzik[2])
        myMuzik.add(1,"al")
        println(myMuzik[1])

        // Set

        val myExampleArray= arrayOf(1,2,3,4)

        // *******  HashMap ******
        val fruitKaloriMap= hashMapOf<String,Int>()
        fruitKaloriMap.put("Elma",150)
        fruitKaloriMap.put("muzz",580)
        println(fruitKaloriMap["muzz"])


        // Switch - When

        val day=3
        var dayGun=""

        /* if(day==1){
            dayGun="pazartesi"
        }
        else if(day==2){
            dayGun="salı"
        }
        else if(day==3){
            dayGun="çarşamba"
        }
        println(dayGun)

         */
        when(day){

            1 ->dayGun ="pazartesi"
            2->dayGun="salı"
            3->dayGun="çarşamba"
            else->dayGun=""
        }
        println(dayGun)


        // ***** Loops - For - While *****

        val myDizi= arrayOf(12,24,33,42,51,66,72,81)

        for(sayi in myDizi){
            val x=sayi/3*5
            println(x)
        }

        for(i in myDizi.indices){
            val qx=myDizi[i]/3*5 // burda dizi içindeki sayıların indisleri yardımıyla döngü oluyor
        }

        for(b in 0..9){
            println(b)
        }
        val diziMetini= arrayListOf<String>()
        diziMetini.add("ömer")
        diziMetini.add("berke")
        diziMetini.add("karadeniz")

        for(str in diziMetini){
            println(str)
        }
        //While Loops
        var j=0
        while(j<10){
            println(j)
            j=j+1

        }
    }
}