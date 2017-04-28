package mtc.com.coffeetakeaway.utlis.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

import mtc.com.coffeetakeaway.R;
import mtc.com.coffeetakeaway.utlis.controls.font.FontCache;


/**
 * Created by Forev on 1/17/2017.
 */

public class CSCheckBox extends CheckBox {
    private void applyFont(Context context, AttributeSet attrs) {
        TypedArray attributeArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.CSFontView
        );

        String fontName = attributeArray.getString(R.styleable.CSFontView_font);
        Typeface typeface = FontCache.getTypeface(fontName, context);
        setTypeface(typeface);
        attributeArray.recycle();
    }

    public CSCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            applyFont(context, attrs);
        }
    }

    public CSCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            applyFont(context, attrs);
        }
    }
}
