package football.league.yogesh.footballleague.controller;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import football.league.yogesh.footballleague.dto.TeamStandingDto;
import football.league.yogesh.footballleague.log.annotation.Trace;
import football.league.yogesh.footballleague.log.eventtype.LogEventType;
import football.league.yogesh.footballleague.model.TeamStandingRequest;
import football.league.yogesh.footballleague.service.TeamStandingService;

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {

  private final TeamStandingService teamStandingService;

  @Autowired
  public FootBallStandingController(
      TeamStandingService teamStandingService) {
    this.teamStandingService = teamStandingService;
  }

  @GetMapping
  @Trace(type = LogEventType.CONTROLLER)
  public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
    log.info("Request {}", teamStandingRequest.toString());
    return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
  }


}
