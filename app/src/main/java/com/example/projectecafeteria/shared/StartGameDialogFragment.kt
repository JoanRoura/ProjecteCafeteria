package com.example.projectecafeteria.shared

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.projectecafeteria.R

class StartGameDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage(R.string.app_name)
                .setPositiveButton(R.string.text_titul_inici,
                    DialogInterface.OnClickListener { dialog, id ->
                        // START THE GAME!
                    })
                .setNegativeButton(R.string.app_name,
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                    })
            // Create the AlertDialog object and return it
            builder.create();
            builder.show();
        } ?: throw IllegalStateException("Activity cannot be null")

    }
}