package com.example.foodapp.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.foodapp.models.FilterQuery;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FilterFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FilterFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private FilterFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FilterFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FilterFragmentArgs __result = new FilterFragmentArgs();
    bundle.setClassLoader(FilterFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("Filter")) {
      FilterQuery Filter;
      if (Parcelable.class.isAssignableFrom(FilterQuery.class) || Serializable.class.isAssignableFrom(FilterQuery.class)) {
        Filter = (FilterQuery) bundle.get("Filter");
      } else {
        throw new UnsupportedOperationException(FilterQuery.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Filter", Filter);
    } else {
      throw new IllegalArgumentException("Required argument \"Filter\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FilterFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    FilterFragmentArgs __result = new FilterFragmentArgs();
    if (savedStateHandle.contains("Filter")) {
      FilterQuery Filter;
      Filter = savedStateHandle.get("Filter");
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Filter", Filter);
    } else {
      throw new IllegalArgumentException("Required argument \"Filter\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public FilterQuery getFilter() {
    return (FilterQuery) arguments.get("Filter");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("Filter")) {
      FilterQuery Filter = (FilterQuery) arguments.get("Filter");
      if (Parcelable.class.isAssignableFrom(FilterQuery.class) || Filter == null) {
        __result.set("Filter", Parcelable.class.cast(Filter));
      } else if (Serializable.class.isAssignableFrom(FilterQuery.class)) {
        __result.set("Filter", Serializable.class.cast(Filter));
      } else {
        throw new UnsupportedOperationException(FilterQuery.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
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
    FilterFragmentArgs that = (FilterFragmentArgs) object;
    if (arguments.containsKey("Filter") != that.arguments.containsKey("Filter")) {
      return false;
    }
    if (getFilter() != null ? !getFilter().equals(that.getFilter()) : that.getFilter() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFilter() != null ? getFilter().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FilterFragmentArgs{"
        + "Filter=" + getFilter()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull FilterFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull FilterQuery Filter) {
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Filter", Filter);
    }

    @NonNull
    public FilterFragmentArgs build() {
      FilterFragmentArgs result = new FilterFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFilter(@NonNull FilterQuery Filter) {
      if (Filter == null) {
        throw new IllegalArgumentException("Argument \"Filter\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Filter", Filter);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public FilterQuery getFilter() {
      return (FilterQuery) arguments.get("Filter");
    }
  }
}
