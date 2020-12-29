package org.csystem.app.samples.ballfallgameapp;

public class BallGame {
    public static boolean updateFlag(int ballIndex, boolean flag, int width)
    {
        if (ballIndex == 0)
            flag = true;
        else if (ballIndex == width - 1)
            flag = false;

        return flag;
    }

    public static int updateBallIndex(boolean flag, int ballIndex)
    {
        if (flag)
            return ballIndex + 1;

        return ballIndex - 1;
    }

    public String result;

    public BallGame()
    {
        result = "";
    }

    public void fillSpace(int begin, int end)
    {
        for (int i = begin; i < end; ++i)
            result += ' ';
    }

    public void fillBall(int ballIndex, int end)
    {
        fillSpace(0, ballIndex);
        result += '*';
        fillSpace(ballIndex + 1, end);
    }


    public void play(int width, int height)
    {
        int ballIndex = 0;
        boolean flag = true;
        result = "";

        for (int i = 1; i <= height; ++i) {
            result += '|';

            fillBall(ballIndex, width);

            flag = updateFlag(ballIndex, flag, width);

            if (width != 1)
                ballIndex = updateBallIndex(flag, ballIndex);

            result += "|\r\n";
        }
    }
}