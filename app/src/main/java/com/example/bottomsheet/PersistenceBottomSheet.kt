package com.example.bottomsheet

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.view_bottom_sheet_persistence.*

class PersistenceBottomSheet : AppCompatActivity() {

    var bottomSheet: BottomSheetBehavior<ConstraintLayout>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persistence_bottom_sheet)
    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        val view = super.onCreateView(name, context, attrs)
        bottomSheet = BottomSheetBehavior.from(ic_bottom_sheet_persistence)
        return view
    }

}
