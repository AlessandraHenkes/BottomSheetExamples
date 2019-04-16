package com.example.bottomsheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBottomSheetBehavior.setOnClickListener {
            startActivity(Intent(this, PersistentBottomSheetActivity::class.java))
        }

        btnBottomSheetDialogFragment.setOnClickListener {
            ModalBottomSheetFragment().show(supportFragmentManager, "BottomSheetDialogFragment")
        }

        btnBottomSheetDialog.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.fragment_modal_bottom_sheet, null)
            val bottomSheet = BottomSheetDialog(this)
            bottomSheet.setContentView(view)
            bottomSheet.show()
        }

        btnBottomSheetFullScreen.setOnClickListener {
            ModalFullScreenBottomSheetFragment().show(supportFragmentManager, "BottomSheetFullScreenDialogFragment")
        }
    }
}
