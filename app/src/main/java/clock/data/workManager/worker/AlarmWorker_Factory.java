// Generated by Dagger (https://dagger.dev).
package clock.data.workManager.worker;

import android.content.Context;

import com.yassineabou.clock.data.manager.WorkRequestManager;
import com.yassineabou.clock.data.repository.AlarmRepository;
import com.yassineabou.clock.util.helper.AlarmNotificationHelper;
import com.yassineabou.clock.util.helper.MediaPlayerHelper;

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
public final class AlarmWorker_Factory {
  public AlarmWorker_Factory() {
  }

  public AlarmWorker get(AlarmRepository alarmRepository,
      AlarmNotificationHelper alarmNotificationHelper, MediaPlayerHelper mediaPlayerHelper,
      WorkRequestManager workRequestManager, Context ctx, WorkerParameters params) {
    return newInstance(alarmRepository, alarmNotificationHelper, mediaPlayerHelper, workRequestManager, ctx, params);
  }

  public static AlarmWorker_Factory create() {
    return new AlarmWorker_Factory();
  }

  public static AlarmWorker newInstance(AlarmRepository alarmRepository,
      AlarmNotificationHelper alarmNotificationHelper, MediaPlayerHelper mediaPlayerHelper,
      WorkRequestManager workRequestManager, Context ctx, WorkerParameters params) {
    return new AlarmWorker(alarmRepository, alarmNotificationHelper, mediaPlayerHelper, workRequestManager, ctx, params);
  }
}
