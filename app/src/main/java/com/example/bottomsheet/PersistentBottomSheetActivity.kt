package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.view_bottom_sheet_persistent.*

class PersistentBottomSheetActivity : AppCompatActivity() {

    var bottomSheet: BottomSheetBehavior<ConstraintLayout>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persistent_bottom_sheet)
        bottomSheet = BottomSheetBehavior.from(cl_bottom_sheet_persistent)
    }
}
