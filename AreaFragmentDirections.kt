package com.evinurastina.foodapp.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.foodapp.R;
import com.example.foodapp.models.FilterQuery;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AreaFragmentDirections {
  private AreaFragmentDirections() {
  }

  @NonNull
  public static ActionAreaFragmentToFilterFragment actionAreaFragmentToFilterFragment(
      @NonNull FilterQuery Filter) {
    return new ActionAreaFragmentToFilterFragment(Filter);
  }

  public static class ActionAreaFragmentToFilterFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionAreaFragmentToFilterFragment(@NonNull FilterQuery Filter) {
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Filter", Filter);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAreaFragmentToFilterFragment setFilter(@NonNull FilterQuery Filter) {
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Filter", Filter);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("Filter")) {
        FilterQuery Filter = (FilterQuery) arguments.get("Filter");
        if (Parcelable.class.isAssignableFrom(FilterQuery.class) || Filter == null) {
          __result.putParcelable("Filter", Parcelable.class.cast(Filter));
        } else if (Serializable.class.isAssignableFrom(FilterQuery.class)) {
          __result.putSerializable("Filter", Serializable.class.cast(Filter));
        } else {
          throw new UnsupportedOperationException(FilterQuery.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_areaFragment_to_filterFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FilterQuery getFilter() {
      return (FilterQuery) arguments.get("Filter");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAreaFragmentToFilterFragment that = (ActionAreaFragmentToFilterFragment) object;
      if (arguments.containsKey("Filter") != that.arguments.containsKey("Filter")) {
        return false;
      }
      if (getFilter() != null ? !getFilter().equals(that.getFilter()) : that.getFilter() != null) {
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
      result = 31 * result + (getFilter() != null ? getFilter().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionAreaFragmentToFilterFragment(actionId=" + getActionId() + "){"
          + "Filter=" + getFilter()
          + "}";
    }
  }
}
