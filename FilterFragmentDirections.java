package com.example.foodapp.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.foodapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FilterFragmentDirections {
  private FilterFragmentDirections() {
  }

  @NonNull
  public static ActionFilterFragmentToRecipeFragment actionFilterFragmentToRecipeFragment() {
    return new ActionFilterFragmentToRecipeFragment();
  }

  public static class ActionFilterFragmentToRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFilterFragmentToRecipeFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFilterFragmentToRecipeFragment setRecipeID(@NonNull String RecipeID) {
      if (RecipeID == null) {
        throw new IllegalArgumentException("Argument \"RecipeID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("RecipeID", RecipeID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("RecipeID")) {
        String RecipeID = (String) arguments.get("RecipeID");
        __result.putString("RecipeID", RecipeID);
      } else {
        __result.putString("RecipeID", "Null");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_filterFragment_to_recipeFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getRecipeID() {
      return (String) arguments.get("RecipeID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFilterFragmentToRecipeFragment that = (ActionFilterFragmentToRecipeFragment) object;
      if (arguments.containsKey("RecipeID") != that.arguments.containsKey("RecipeID")) {
        return false;
      }
      if (getRecipeID() != null ? !getRecipeID().equals(that.getRecipeID()) : that.getRecipeID() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getRecipeID() != null ? getRecipeID().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFilterFragmentToRecipeFragment(actionId=" + getActionId() + "){"
          + "RecipeID=" + getRecipeID()
          + "}";
    }
  }
}
