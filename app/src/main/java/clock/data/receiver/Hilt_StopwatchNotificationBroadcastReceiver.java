package clock.data.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_StopwatchNotificationBroadcastReceiver extends BroadcastReceiver {
  private volatile boolean injected = false;

  private final Object injectedLock = new Object();

  private final boolean onReceiveBytecodeInjectionMarker = false;

  @Override
  @CallSuper
  public void onReceive(Context context, Intent intent) {
    inject(context);
  }

  protected void inject(Context context) {
    if (!injected) {
      synchronized (injectedLock) {
        if (!injected) {
          ((StopwatchNotificationBroadcastReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectStopwatchNotificationBroadcastReceiver(UnsafeCasts.<StopwatchNotificationBroadcastReceiver>unsafeCast(this));
          injected = true;
        }
      }
    }
  }
}
