package vn.com.mpsoftware.trainninga4.Fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vn.com.mpsoftware.trainninga4.R


/**
 * Created by sonvc on 1/11/2018.
 */
class FragmentOne : Fragment(){

    var TAG : String = this.javaClass.simpleName

    override fun onAttach(context: Context?) {
        Log.i(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG,"onCreateView")
        return inflater!!.inflate(R.layout.fragment1, container, false)
    }

    override fun onStart() {
        Log.i(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG,"onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG,"onDetach")
        super.onDetach()
    }
}