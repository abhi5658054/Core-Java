package com.greatlearning.twitter.model;

import java.util.Date;
import java.util.Objects;

public class Tweet {
	 private final long id;
	 private String tweetMessage;
	 private final String mediaUrl;
	 private final Date createdDt;
	 private static int idCounter = 100;
	 
	 public Tweet(String tweetMessage, String mediaUrl) {
	        this.id = ++idCounter;
	        this.tweetMessage = tweetMessage;
	        this.mediaUrl = mediaUrl;
	        this.createdDt = new Date();
	}
	
	 public Tweet(String tweetMessage) {
	        this.id = ++idCounter;
	        this.tweetMessage = tweetMessage;
	        this.mediaUrl = null;
	        this.createdDt = new Date();
	}public long getId() {
       return id;
   }

   public String getMessage() {
       return tweetMessage;
   }

   public String getMediaUrl() {
       return mediaUrl;
   }

   public Date getCreatedDt() {
       return createdDt;
   }

   public static void setIdCounter(int idCounter) {
       Tweet.idCounter = idCounter;
   }

   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Tweet tweet = (Tweet) o;
       return id == tweet.id &&
               Objects.equals(tweetMessage, tweet.tweetMessage) &&
               Objects.equals(createdDt, tweet.createdDt);
   }

   @Override
   public int hashCode() {
       return Objects.hash(id, tweetMessage, createdDt);
   }

   @Override
   public String toString() {
       return "Tweet{" +
               "tweetMessage='" + tweetMessage + '\'' +
               ", mediaUrl='" + mediaUrl + '\'' +
               '}';
}
	
	 
	 
	 class Stats{
	        private int likes;
	        private int comments;
	        private int retweetCount;

	        public int getLikes() {
	            return likes;
	        }

	        public void setLikes(int likes) {
	            this.likes = likes;
	        }

	        public int getComments() {
	            return comments;
	        }

	        public void setComments(int comments) {
	            this.comments = comments;
	        }

	        public int getRetweetCount() {
	            return retweetCount;
	        }

	        public void setRetweetCount(int retweetCount) {
	            this.retweetCount = retweetCount;
	        }

	        @Override
	        public String toString() {
	            return "Stats{" +
	                    "likes=" + likes +
	                    ", comments=" + comments +
	                    ", retweetCount=" + retweetCount +
	                    '}';
	        }
	}
	

}
