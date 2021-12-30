package top.sxuet.daydayup.process;

import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.sxuet.daydayup.OneProcessService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sxuet
 * @program daydayup
 * @description
 * @since 2021-11-10 16:42
 */
@RestController
public class OneProcessController {
  @Autowired private OneProcessService oneProcessService;

  @PostMapping("/process")
  public void startProcessInstance() {
    oneProcessService.startProcess();
  }

  @GetMapping(value = "/tasks")
  public List<TaskRepresentation> getTasks(@RequestParam String assignee) {
    List<Task> tasks = oneProcessService.getTasks(assignee);
    List<TaskRepresentation> dtos = new ArrayList<>();
    for (Task task : tasks) {
      dtos.add(new TaskRepresentation(task.getId(), task.getName()));
    }
    return dtos;
  }

  @GetMapping("/hello")
  public List<String> hello(@RequestParam String hello) {
    return new LinkedList<>(Collections.singletonList(hello));
  }

  static class TaskRepresentation {

    private String id;
    private String name;

    public TaskRepresentation(String id, String name) {
      this.id = id;
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
