package com.skity.android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var mOpenGLExample: Button? = null
    private var mOpenGLSVGExample: Button? = null
    private var mOpenGLFrameExample: Button? = null
    private var mVulkanSVGExample: Button? = null
    private var mVulkanFrameExample: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        mOpenGLExample = findViewById(R.id.gl_example)
        mOpenGLSVGExample = findViewById(R.id.gl_svg_example)
        mOpenGLFrameExample = findViewById(R.id.gl_frame_example)
        mVulkanSVGExample = findViewById(R.id.vk_svg_example)
        mVulkanFrameExample = findViewById(R.id.vk_frame_example)

        mOpenGLExample?.setOnClickListener(this)
        mOpenGLSVGExample?.setOnClickListener(this)
        mOpenGLFrameExample?.setOnClickListener(this)
        mVulkanSVGExample?.setOnClickListener(this)
        mVulkanFrameExample?.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = Intent()
        if (view === mOpenGLExample) {
            intent.setClass(this, GLRenderActivity::class.java)
        } else if (view === mOpenGLSVGExample) {
            intent.setClass(this, GLSVGRenderActivity::class.java)
        } else if (view === mOpenGLFrameExample) {
            intent.setClass(this, GLFrameActivity::class.java)
        } else if (view === mVulkanSVGExample) {
            intent.setClass(this, VkSVGActivity::class.java)
        } else if (view === mVulkanFrameExample) {
            intent.setClass(this, VkFrameActivity::class.java)
        }

        this.startActivity(intent)
    }
}