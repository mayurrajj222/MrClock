// Generated by Dagger (https://dagger.dev).
package clock.data.workManager.worker;

import android.content.Context;

import com.yassineabou.clock.data.manager.StopwatchManager;
import com.yassineabou.clock.util.helper.StopwatchNotificationHelper;

import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class StopwatchWorker_Factory {
  public StopwatchWorker_Factory() {
  }

  public StopwatchWorker get(StopwatchManager stopwatchManager,
      StopwatchNotificationHelper stopwatchNotificationHelper, Context ctx,
      WorkerParameters params) {
    return newInstance(stopwatchManager, stopwatchNotificationHelper, ctx, params);
  }

  public static StopwatchWorker_Factory create() {
    return new StopwatchWorker_Factory();
  }

  public static StopwatchWorker newInstance(StopwatchManager stopwatchManager,
      StopwatchNotificationHelper stopwatchNotificationHelper, Context ctx,
      WorkerParameters params) {
    return new StopwatchWorker(stopwatchManager, stopwatchNotificationHelper, ctx, params);
  }
}
