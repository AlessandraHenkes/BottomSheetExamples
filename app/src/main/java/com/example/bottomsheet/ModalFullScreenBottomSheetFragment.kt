package com.example.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.fragment_modal_full_screen_bottom_sheet.view.*

class ModalFullScreenBottomSheetFragment : BottomSheetDialogFragment() {

    private var mBehavior: BottomSheetBehavior<View>? = null
    private val animFadeIn by lazy {
        AnimationUtils.loadAnimation(context, R.anim.fade_in)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog

        val view = View.inflate(context, R.layout.fragment_modal_full_screen_bottom_sheet, null)

        dialog.setContentView(view)

        view.toolbar.setNavigationOnClickListener {
            dismiss()
        }

        mBehavior = BottomSheetBehavior.from(view.parent as View)
        mBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(view: View, offset: Float) {}

            override fun onStateChanged(view: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED || newState == BottomSheetBehavior.STATE_HIDDEN) {
                    dismiss()
                    return
                }

                if (newState == BottomSheetBehavior.STATE_DRAGGING) {
                    if (view.toolbar.visibility != View.VISIBLE) {
                        view.toolbar.visibility = View.VISIBLE
                        view.toolbar.startAnimation(animFadeIn)
                    }
                    return
                }
            }
        })

        return dialog
    }

    override fun onStart() {
        super.onStart()
        mBehavior?.state = BottomSheetBehavior.STATE_HALF_EXPANDED
    }
}
