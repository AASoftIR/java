import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamManagementSystem {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Get complete information of a team");
            System.out.println("2. Display the information of all teams");
            System.out.println("3. Get the team code and display the complete team information");
            System.out.println("4. Each country receives a coach and displays the name of his team");
            System.out.println("5. Receive the player's national code and display his team name");
            System.out.println("6. Display players who have the name Ali");
            System.out.println("7. Display all players who are over 30 years old by the date of birth on 1/1/1402");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Get complete information of a team
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter team name: ");
                    String teamName = scanner.nextLine();

                    System.out.print("Enter team code: ");
                    String teamCode = scanner.nextLine();

                    System.out.print("Enter coach's name: ");
                    String coachName = scanner.nextLine();

                    System.out.print("Enter coach's surname: ");
                    String coachSurname = scanner.nextLine();

                    System.out.print("Enter coach's national code: ");
                    String coachNationalCode = scanner.nextLine();

                    System.out.print("Enter coach's date of birth: ");
                    String coachDateOfBirth = scanner.nextLine();

                    System.out.print("Enter coach's card type: ");
                    String coachingCardType = scanner.nextLine();

                    Coach coach = new Coach(coachName, coachSurname, coachNationalCode, coachDateOfBirth, coachingCardType);

                    Team team = new Team(teamName, teamCode);
                    team.setCoach(coach);

                    for (int i = 1; i <= 11; i++) {
                        System.out.println("Enter details for player " + i + ":");
                        System.out.print("Name: ");
                        String playerName = scanner.nextLine();

                        System.out.print("Surname: ");
                        String playerSurname = scanner.nextLine();

                        System.out.print("National Code: ");
                        String playerNationalCode = scanner.nextLine();

                        System.out.print("Date of Birth: ");
                        String playerDateOfBirth = scanner.nextLine();

                        System.out.print("Position: ");
                        String playerPosition = scanner.nextLine();

                        Player player = new Player(playerName, playerSurname, playerNationalCode, playerDateOfBirth, playerPosition);
                        team.addPlayer(player);
                    }

                    teams.add(team);
                    System.out.println("Team information added successfully.");
                    System.out.println();
                    break;

                case 2:
                    // Display the information of all teams
                    if (teams.isEmpty()) {
                        System.out.println("No teams found.");
                    } else {
                        for (Team t : teams) {
                            System.out.println("Team Name: " + t.getName());
                            System.out.println("Team Code: " + t.getTeamCode());
                            System.out.println("Players:");
                            for (Player p : t.getPlayers()) {
                                System.out.println("  Player Name: " + p.getName() + " " + p.getSurname());
                                System.out.println("  National Code: " + p.getNationalCode());
                                System.out.println("  Date of Birth: " + p.getDateOfBirth());
                                System.out.println("  Position: " + p.getPosition());
                                System.out.println();
                            }
                            System.out.println("Coach:");
                            Coach c = t.getCoach();
                            System.out.println("  Name: " + c.getName() + " " + c.getSurname());
                            System.out.println("  National Code: " + c.getNationalCode());
                            System.out.println("  Date of Birth: " + c.getDateOfBirth());
                            System.out.println("  Coaching Card Type: " + c.getCoachingCardType());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Get the team code and display the complete team information
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter team code: ");
                    String teamCodeInput = scanner.nextLine();

                    boolean teamFound = false;
                    for (Team t : teams) {
                        if (t.getTeamCode().equals(teamCodeInput)) {
                            teamFound = true;
                            System.out.println("Team Name: " + t.getName());
                            System.out.println("Team Code: " + t.getTeamCode());
                            System.out.println("Players:");
                            for (Player p : t.getPlayers()) {
                                System.out.println("  Player Name: " + p.getName() + " " + p.getSurname());
                                System.out.println("  National Code: " + p.getNationalCode());
                                System.out.println("  Date of Birth: " + p.getDateOfBirth());
                                System.out.println("  Position: " + p.getPosition());
                                System.out.println();
                            }
                            System.out.println("Coach:");
                            Coach c = t.getCoach();
                            System.out.println("  Name: " + c.getName() + " " + c.getSurname());
                            System.out.println("  National Code: " + c.getNationalCode());
                            System.out.println("  Date of Birth: " + c.getDateOfBirth());
                            System.out.println("  Coaching Card Type: " + c.getCoachingCardType());
                            System.out.println();
                            break;
                        }
                    }

                    if (!teamFound) {
                        System.out.println("No team found with the given code.");
                    }
                    break;

                case 4:
                    // Each country receives a coach and displays the name of his team
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter coach's national code: ");
                    String coachNationalCodeInput = scanner.nextLine();

                    boolean coachFound = false;
                    for (Team t : teams) {
                        Coach c = t.getCoach();
                        if (c.getNationalCode().equals(coachNationalCodeInput)) {
                            coachFound = true;
                            System.out.println("Coach Name: " + c.getName() + " " + c.getSurname());
                            System.out.println("Team Name: " + t.getName());
                            System.out.println("Team Code: " + t.getTeamCode());
                            System.out.println();
                            break;
                        }
                    }

                    if (!coachFound) {
                        System.out.println("No coach found with the given national code.");
                    }
                    break;

                case 5:
                    // Receive the player's national code and display his team name
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter player's national code: ");
                    String playerNationalCodeInput = scanner.nextLine();

                    boolean playerFound = false;
                    for (Team t : teams) {
                        for (Player p : t.getPlayers()) {
                            if (p.getNationalCode().equals(playerNationalCodeInput)) {
                                playerFound = true;
                                System.out.println("Player Name: " + p.getName() + " " + p.getSurname());
                                System.out.println("Team Name: " + t.getName());
                                System.out.println("Team Code: " + t.getTeamCode());
                                System.out.println();
                                break;
                            }
                        }
                        if (playerFound) {
                            break;
                        }
                    }

                    if (!playerFound) {
                        System.out.println("No player found with the given national code.");
                    }
                    break;

                case 6:
                    // Display players who have the name Ali
                    boolean aliFound = false;
                    for (Team t : teams) {
                        for (Player p : t.getPlayers()) {
                            if (p.getName().equalsIgnoreCase("Ali")) {
                                aliFound = true;
                                System.out.println("Player Name: " + p.getName() + " " + p.getSurname());
                                System.out.println("Team Name: " + t.getName());
                                System.out.println("Team Code: " + t.getTeamCode());
                                System.out.println();
                            }
                        }
                    }

                    if (!aliFound) {
                        System.out.println("No players with the name Ali found.");
                    }
                    break;

                case 7:
                    // Display all players who are over 30 years old by the date of birth on 1/1/1402
                    boolean over30Found = false;
                    for (Team t : teams) {
                        for (Player p : t.getPlayers()) {
                            String[] dobParts = p.getDateOfBirth().split("/");
                            int yearOfBirth = Integer.parseInt(dobParts[2]);

                            if (yearOfBirth < 1372) {
                                over30Found = true;
                                System.out.println("Player Name: " + p.getName() + " " + p.getSurname());
                                System.out.println("Team Name: " + t.getName());
                                System.out.println("Team Code: " + t.getTeamCode());
                                System.out.println();
                            }
                        }
                    }

                    if (!over30Found) {
                        System.out.println("No players over 30 years old found.");
                    }
                    break;

                case 8:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }
        }
    }
}
