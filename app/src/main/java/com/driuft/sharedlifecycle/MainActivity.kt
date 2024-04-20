package com.driuft.sharedlifecycle

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var _sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _sharedPreferences = this.getSharedPreferences(this.packageName, Context.MODE_PRIVATE)

        // Write the state
        with (_sharedPreferences.edit()) {
            // replace "onCreate" with the name of the method you're saving
            putString(getString(R.string.current_lifecycle_state), "onCreate")
            apply()
        }

        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log the state
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onStart")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        // Log the state
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onResume")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onPause")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onStop")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onRestart")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        with (_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onDestroy")
            apply()
        }
        // Read the state
        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }
}