//Hometask 9 by alexey Seikin
package science.involta.lesson_10

import android.app.Activity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity: Activity() {

    private val LOG_TAG = "HelloWorld -> MainActivity"
    //жизненный цикл Activity

    //основная точка входа в Activity
    //создана, не видна пользователю
    //инициализация UI
    //восстановление сохраненного состояния
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        try {
            1 / 0
        } catch (e: Exception) {
            Log.e(LOG_TAG, e.message.toString())
        }
        //вывод логов в порядке приоритета
        Log.e(LOG_TAG,"Произошла ошибка")
        Log.w(LOG_TAG,"Предупреждение")
        Log.i(LOG_TAG,"Info")
        Log.d(LOG_TAG,"Debug сообщение")
        Log.v(LOG_TAG,"Подробное описание")
    }

    //подготовка Activity к отображению на экране
    //прим.: подготовка GPS или камеры
    //видна пользователю
    override fun onStart() {
        super.onStart()
    }

    //подготовка Activity к взаимодействию с пользователем
    //пользователь может взаимодействовать
    //состояние сохраняется до момента переключения в другое приложение
    override fun onResume() {
        super.onResume()
    }

    //Activity еще видна, но нет возможности взаимодействия с пользователем
    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    //Объект Activity полностью  удаляется
    override fun onDestroy() {
        super.onDestroy()
    }
}