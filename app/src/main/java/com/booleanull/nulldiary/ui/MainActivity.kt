package com.booleanull.nulldiary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.booleanull.nulldiary.R
import com.booleanull.nulldiary.model.Note
import com.booleanull.nulldiary.ui.adapter.NoteAdapter
import com.booleanull.recyclerdivider.Line
import com.booleanull.recyclerdivider.RecyclerDivider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*


class MainActivity : AppCompatActivity() {

    val TAG = "NULL_DIARY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val notes = listOf(
            Note(
                "Business",
                "20.04.2009",
                "jdhaskjdhak sjhdkajshdkajsh dkjashdkjashd kjashdkjashdkj ashdkjash dkjashdkj"
            ),
            Note("Games", "20.04.2009", "jdhaskjdhak sjhdkajshdkajsh dkjashdkjashd kjashdkjashdkj ashdkjash dkjashdkj"),
            Note(
                "Twitter",
                "20.04.2009",
                "jdhaskjdhak sjhdkajshdkajsh dkjashdkjashd kjashdkjashdkj ashdkjash dkjashdkj"
            ),
            Note("Helloc", "20.04.2009", "jdhaskjdhak sjhdkajshdkajsh dkjashdkjashd kjashdkjashdkj ashdkjash dkjashdkj")
        )

        val noteAdapter = NoteAdapter(notes)
        recyclerView.adapter = noteAdapter

        recyclerView.addItemDecoration(RecyclerDivider(32, Line(32, 32, 2, ContextCompat.getColor(this, R.color.colorLightGray))))
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}
