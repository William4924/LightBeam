package com.company;

/**
 * Created by William on 11/8/2016.
 */
public class LightBeamGame {

    public enum STATE {

        INIT,
        CHANGE_SCREEN,
        WAIT
    }

    public static STATE currentState = STATE.INIT;
    public static StringBuilder mapText = new StringBuilder("");

    public static void runGame() {

        while (true) {

            switch (currentState) {

                case INIT:

                    drawOuterWalls();
                    currentState = STATE.CHANGE_SCREEN;

                    break;

                case CHANGE_SCREEN:

                    break;

                case WAIT:

                    break;
            }
        }
    }

    public static void drawOuterWalls() {

        StringBuilder horizontalWall = new StringBuilder("");

        for (int rowIndex = 0 ; rowIndex < LightBeamActivity.WIDTH ; rowIndex++) {

            horizontalWall.append("#");
        }

        mapText.append(horizontalWall);
        mapText.append("\n");

        for (int columnIndex = 1 ; columnIndex < LightBeamActivity.HEIGHT - 1 ; columnIndex++) {

            for (int rowIndex = 0 ; rowIndex < LightBeamActivity.WIDTH ; rowIndex++) {

                if (rowIndex == 0) {

                    mapText.append("#");

                } else {

                    if (rowIndex == LightBeamActivity.WIDTH - 1) {

                        mapText.append("#");
                        mapText.append("\n");

                    } else {

                        mapText.append(" ");
                    }
                }
            }
        }

        mapText.append(horizontalWall);
    }
}
