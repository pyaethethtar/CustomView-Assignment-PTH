package com.example.customview.views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.widget.ImageView
import androidx.core.content.withStyledAttributes
import com.example.customview.R

class CircleImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ImageView(context, attrs, defStyleAttr) {

    private var cornerRadius = 0f

    private val path = Path()

    init {

        context.withStyledAttributes(attrs, R.styleable.CircleImageView) {
            cornerRadius = getDimension(R.styleable.CircleImageView_cornerRadius, 0f)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        val circle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        path.addRoundRect(circle, cornerRadius, cornerRadius, Path.Direction.CCW)

        canvas?.clipPath(path)
        super.onDraw(canvas)
    }
}