package com.jjump.spring.CLI;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleBannerProvider extends DefaultBannerProvider {

    public String getBanner() {
        StringBuilder strB = new StringBuilder();
        strB.append("   __________________________         ").append(OsUtils.LINE_SEPARATOR);
        strB.append("  |                          |         ").append(OsUtils.LINE_SEPARATOR);
        strB.append("  |         Welcome          |         ").append(OsUtils.LINE_SEPARATOR);
        strB.append("  |__________________________|         ").append(OsUtils.LINE_SEPARATOR);

        StringBuilder strB2 = new StringBuilder();
        strB2.append("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@@@     @@@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@@  @@@  @@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@  @@@@@@@@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@  @@@    @@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@@  @@@  @@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@@@     @@@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);
        strB2.append("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@        ").append(OsUtils.LINE_SEPARATOR);

        StringBuilder strB3 = new StringBuilder();
        strB3.append("          ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("          ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("                             ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("                        ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("         @     @                 ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("     @@   @   @   @@      /         ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("      @@   @ @   @@      /          ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("       @@   @   @@      /         ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("        @@     @@      /    ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("         @@   @@      /            ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("          @@ @@      /             ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("           @@@      /________________              ").append(OsUtils.LINE_SEPARATOR);
        strB3.append("                                ").append(OsUtils.LINE_SEPARATOR);

        StringBuilder strB4 = new StringBuilder();
        strB4.append("                           @@                                       ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                          @@@@                                         ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                         @@  @@                                       ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                        @@    @@                                      ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                       @@      @@                                     ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                      @@        @@                                    ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                     @@          @@                                   ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                    @@   @@@@@@   @@                                  ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                   @@  @@@    @@@  @@                                 ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                  @@ @@@   @@   @@@ @@                                ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                 @@ @@    @@@@    @@ @@                               ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                @@   @@@   @@   @@@   @@                              ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("               @@      @@@    @@@      @@                             ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("              @@         @@@@@@         @@                            ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("             @@                          @@                        ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                           ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                                                                      ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("               @                          @                               ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("              @ @          @@            @ @                                 ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("             @   @        @  @          @   @                               ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("              @@@        @    @          @@@                                  ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                        @  @@  @                                        ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                         @    @                                         ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                          @@@@                                            ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                                                                      ").append(OsUtils.LINE_SEPARATOR);
        strB4.append("                                                                      ").append(OsUtils.LINE_SEPARATOR);




        return strB4.toString();
    }

    public String getVersion() {
        return "0.0.1";
    }

    public String getWelcomeMessage() {
        return "норм, давай работать";
    }

    public String getProviderName() {
        return "Gennadii_B";
    }
}
