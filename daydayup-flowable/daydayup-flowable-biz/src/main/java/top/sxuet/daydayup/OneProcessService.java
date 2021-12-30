package top.sxuet.daydayup;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Sxuet
 * @program daydayup
 * @description
 * @since 2021-11-10 09:45
 */
@Service
public class OneProcessService {

  /**
   * 引擎API的总入口点是ProcessEngine。<br>
   * ProcessEngine 可以使用多种方式创建以获得各种提供工作流/BPM方法的服务。<br>
   * ProcessEngine 与服务对象都是线程安全的，因此可以在服务器中保存并共用同一个引用。<br>
   * 这里的 RuntimeService TaskService 都是 ProcessEngine 的直接或间接子类
   */
  @Autowired private RuntimeService runtimeService;

  @Autowired private TaskService taskService;

  @Transactional
  public void startProcess() {
    runtimeService.startProcessInstanceByKey("oneTaskProcess");
  }

  @Transactional
  public List<Task> getTasks(String assignee) {
    return taskService.createTaskQuery().taskAssignee(assignee).list();
  }
}
