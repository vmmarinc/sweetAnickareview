package com.vmmarinc.sweetanikca

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vmmarinc.sweetanikca.databinding.FragmentCommentBinding
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [CommentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CommentFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var _binding: FragmentCommentBinding? = null
    private lateinit var commentAdapter: CommentAdapter
    private lateinit var commentManager: LinearLayoutManager
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        commentAdapter = CommentAdapter (
            listOf(
                Comment("", "wef", "dfghfjdngffdghtrbvc"),
                Comment("", "Pepito", "dfghfjdngffdghtrbvc"),
                Comment("", "Andres", "dfghfjdngffdghtrbvc"),
                )

            )

        commentAdapter.listener = object: CommentListener {
            override fun onClick(comment: Comment){
                Log.d("Click", comment.name)
            }
        }
        commentManager = LinearLayoutManager(requireContext())
        binding.commentRecycler.apply{
            adapter = commentAdapter
            layoutManager = commentManager
        }


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCommentBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_comment, container, false)
    }


}