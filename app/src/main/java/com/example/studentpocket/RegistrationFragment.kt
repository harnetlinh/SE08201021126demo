package com.example.studentpocket

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Tìm view
        val name = view.findViewById<EditText>(R.id.edtName)
        val major = view.findViewById<EditText>(R.id.edtMajor)
        val id = view.findViewById<EditText>(R.id.edtStudentID)
        val save = view.findViewById<Button>(R.id.btnSave)

        val app = requireContext().applicationContext

        // mở hồ sơ
        view.findViewById<Button>(R.id.btnProfile)
            .setOnClickListener {
                val intent = Intent(
                    requireContext(),
                    StudentProfileActivity::class.java
                )
                intent.putExtra("NAME", name.text.toString())
                intent.putExtra("ID", id.text.toString())
                intent.putExtra("MAJOR", major.text.toString())
                startActivity(intent)
            }
        // đổi fragment
        // lưu
        // đọc lại
    }


}