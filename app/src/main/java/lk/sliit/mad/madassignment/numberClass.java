package lk.sliit.mad.madassignment;

import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/**
 * Created by mtit on 5/27/2017.
 */

public class numberClass
{
    int Token;
    public int betMoves;
    public int betPoints;
    int moveCount;
    int totalPoints;

    numberClass()
    {
        moveCount = 0;
        totalPoints = 0;
        betMoves = 0;
        betPoints = 0;
    }

    public int getToken()
    {
        return Token;
    }

    public void setToken(int token)
    {
        Token = token;
    }

    public int getBetMoves()
    {
        return betMoves;
    }

    public void setBetMoves(int betMoves)
    {
        this.betMoves = betMoves;
    }

    public int getMoveCount()
    {
        return moveCount;
    }

    public void setMoveCount(int moveCount)
    {
        this.moveCount = moveCount;
    }

    public int getTotalPoints()
    {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints)
    {
        this.totalPoints = totalPoints;
    }
}
