package com.example.foodapp.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RecipeFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RecipeFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private RecipeFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RecipeFragmentArgs __result = new RecipeFragmentArgs();
    bundle.setClassLoader(RecipeFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("RecipeID")) {
      String RecipeID;
      RecipeID = bundle.getString("RecipeID");
      if (RecipeID == null) {
        throw new IllegalArgumentException("Argument \"RecipeID\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("RecipeID", RecipeID);
    } else {
      __result.arguments.put("RecipeID", "Null");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    RecipeFragmentArgs __result = new RecipeFragmentArgs();
    if (savedStateHandle.contains("RecipeID")) {
      String RecipeID;
      RecipeID = savedStateHandle.get("RecipeID");
      if (RecipeID == null) {
        throw new IllegalArgumentException("Argument \"RecipeID\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("RecipeID", RecipeID);
    } else {
      __result.arguments.put("RecipeID", "Null");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getRecipeID() {
    return (String) arguments.get("RecipeID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("RecipeID")) {
      String RecipeID = (String) arguments.get("RecipeID");
      __result.putString("RecipeID", RecipeID);
    } else {
      __result.putString("RecipeID", "Null");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("RecipeID")) {
      String RecipeID = (String) arguments.get("RecipeID");
      __result.set("RecipeID", RecipeID);
    } else {
      __result.set("RecipeID", "Null");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RecipeFragmentArgs that = (RecipeFragmentArgs) object;
    if (arguments.containsKey("RecipeID") != that.arguments.containsKey("RecipeID")) {
      return false;
    }
    if (getRecipeID() != null ? !getRecipeID().equals(that.getRecipeID()) : that.getRecipeID() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getRecipeID() != null ? getRecipeID().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RecipeFragmentArgs{"
        + "RecipeID=" + getRecipeID()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull RecipeFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public RecipeFragmentArgs build() {
      RecipeFragmentArgs result = new RecipeFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setRecipeID(@NonNull String RecipeID) {
      if (RecipeID == null) {
        throw new IllegalArgumentException("Argument \"RecipeID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("RecipeID", RecipeID);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getRecipeID() {
      return (String) arguments.get("RecipeID");
    }
  }
}
