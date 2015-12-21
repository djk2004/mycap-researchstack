package co.touchlab.researchstack.glue.ui.scene;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.touchlab.researchstack.core.result.StepResult;
import co.touchlab.researchstack.core.ui.scene.SceneImpl;

public abstract class AbstractSignUpInclusionCriteriaScene extends SceneImpl<Boolean>
{

    public AbstractSignUpInclusionCriteriaScene(Context context)
    {
        super(context);
    }

    public AbstractSignUpInclusionCriteriaScene(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public AbstractSignUpInclusionCriteriaScene(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public View onCreateBody(LayoutInflater inflater, ViewGroup parent)
    {
        return inflater.inflate(getLayoutId(),
                parent,
                false);
    }

    @Override
    public StepResult<Boolean> getStepResult()
    {
        StepResult<Boolean> result = super.getStepResult();
        result.setResult(isEligible());
        return result;
    }

    public abstract int getLayoutId();

    public abstract boolean isEligible();

    public abstract boolean isAnswerValid();

    public abstract void onBodyCreated(View body);
}
