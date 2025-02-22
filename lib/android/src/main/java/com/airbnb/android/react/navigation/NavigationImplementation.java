package com.airbnb.android.react.navigation;

import android.view.Menu;
import android.view.MenuItem;
import com.facebook.react.bridge.ReadableMap;

import androidx.appcompat.app.ActionBar;

interface NavigationImplementation {
  void reconcileNavigationProperties(
      ReactInterface component,
      ReactToolbar toolbar,
      ActionBar bar,
      ReadableMap previous,
      ReadableMap next,
      boolean firstCall
  );

  void prepareOptionsMenu(
      ReactInterface component,
      ReactToolbar toolbar,
      ActionBar bar,
      Menu menu,
      ReadableMap previous,
      ReadableMap next
  );

  boolean onOptionsItemSelected(
      ReactInterface component,
      ReactToolbar toolbar,
      ActionBar bar,
      MenuItem item,
      ReadableMap config
  );

  float getBarHeight(
      ReactInterface component,
      ReactToolbar toolbar,
      ActionBar actionBar,
      ReadableMap config,
      boolean firstCall
  );

  void makeTabItem(
      ReactBottomNavigation bottomNavigation,
      Menu menu,
      int index,
      Integer itemId,
      ReadableMap config
  );

  void reconcileTabBarProperties(
      ReactBottomNavigation bottomNavigation,
      Menu menu,
      ReadableMap prev,
      ReadableMap next
  );
}
